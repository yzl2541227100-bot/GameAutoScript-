package com.example.myapplication.ui.game

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** 配置项 CheckBox */
@Composable
fun ConfigCheckbox(
    label: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(6.dp))
            .clickable { onCheckedChange(!checked) }
            .padding(horizontal = 4.dp, vertical = 2.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = Modifier.size(36.dp)
        )
        Spacer(Modifier.width(4.dp))
        Text(label, fontSize = 14.sp)
    }
}


/** 配置项 Spinner (下拉选择) */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConfigSpinner(
    label: String,
    selected: String,
    options: List<String>,
    onSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, fontSize = 14.sp, modifier = Modifier.weight(1f))
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = it }
        ) {
            OutlinedTextField(
                value = selected,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier
                    .menuAnchor(MenuAnchorType.PrimaryNotEditable)
                    .width(180.dp),
                textStyle = LocalTextStyle.current.copy(fontSize = 13.sp),
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                singleLine = true
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        text = { Text(option, fontSize = 13.sp) },
                        onClick = {
                            onSelected(option)
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}

/** 配置项 EditText (数字输入) */
@Composable
fun ConfigNumberInput(
    label: String,
    value: Int,
    onValueChange: (Int) -> Unit,
    suffix: String = "",
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, fontSize = 14.sp, modifier = Modifier.weight(1f))
        OutlinedTextField(
            value = value.toString(),
            onValueChange = { it.toIntOrNull()?.let(onValueChange) },
            modifier = Modifier.width(120.dp),
            textStyle = LocalTextStyle.current.copy(fontSize = 13.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            trailingIcon = if (suffix.isNotEmpty()) {
                { Text(suffix, fontSize = 12.sp, modifier = Modifier.padding(end = 8.dp)) }
            } else null
        )
    }
}

/** 配置项 EditText (文本输入) */
@Composable
fun ConfigTextInput(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, fontSize = 14.sp, modifier = Modifier.weight(1f))
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.width(180.dp),
            textStyle = LocalTextStyle.current.copy(fontSize = 13.sp),
            singleLine = true
        )
    }
}

/** 分组标题 */
@Composable
fun ConfigSectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(top = 12.dp, bottom = 4.dp, start = 4.dp)
    )
    HorizontalDivider(
        modifier = Modifier.padding(bottom = 4.dp),
        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
    )
}

/** 队伍选择行 (CheckBox + Spinner) */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeamRow(
    teamName: String,
    enabled: Boolean,
    onEnabledChange: (Boolean) -> Unit,
    troopType: String,
    troopOptions: List<String>,
    onTroopChange: (String) -> Unit,
    autoForce: Boolean = false,
    onAutoForceChange: ((Boolean) -> Unit)? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = enabled,
            onCheckedChange = onEnabledChange,
            modifier = Modifier.size(32.dp)
        )
        Text(teamName, fontSize = 13.sp, modifier = Modifier.width(50.dp))

        var expanded by remember { mutableStateOf(false) }
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = it },
            modifier = Modifier.weight(1f)
        ) {
            OutlinedTextField(
                value = troopType,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier
                    .menuAnchor(MenuAnchorType.PrimaryNotEditable)
                    .fillMaxWidth(),
                textStyle = LocalTextStyle.current.copy(fontSize = 12.sp),
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                singleLine = true
            )
            ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                troopOptions.forEach { opt ->
                    DropdownMenuItem(
                        text = { Text(opt, fontSize = 12.sp) },
                        onClick = { onTroopChange(opt); expanded = false }
                    )
                }
            }
        }

        if (onAutoForceChange != null) {
            Spacer(Modifier.width(4.dp))
            Checkbox(
                checked = autoForce,
                onCheckedChange = onAutoForceChange,
                modifier = Modifier.size(28.dp)
            )
            Text("自动", fontSize = 11.sp)
        }
    }
}

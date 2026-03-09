cmake_minimum_required(VERSION 3.22.1)
project("mqm")

# native 脚本引擎库
add_library(mqm SHARED
    native-lib.cpp
)

target_link_libraries(mqm
    android
    log
)

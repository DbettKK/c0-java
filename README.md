# README

本repo为2018级软件学院编译大作业C0项目，采用Java语言编写，同时使用[Antlr4](https://www.antlr.org/)作为辅助工具

项目以纯文本文档作为输入，以虚拟机指令作为输出

具体使用可参考[judge.toml](https://github.com/DbettKK/c0-java/blob/master/judge.toml)的逻辑，其中$input为输入的文件，$asm为输出的虚拟机指令

## 各个目录的含义

    compile-out -> 编译产物及测试用exe
    src ->
        c0 -> ANTLR的产物
        listener -> 错误检查 保证 ANTLR 正常报错
        trying -> 中途的无限次尝试的产物
        visitor -> 最终实现的代码
    submit -> 代码提交评测所需
    resources ->
        c0.g4 -> 文法描述
    c0-jar -> 产出jar包

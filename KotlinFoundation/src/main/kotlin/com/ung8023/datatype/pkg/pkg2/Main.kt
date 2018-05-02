package com.ung8023.datatype.pkg.pkg2

//起别名
import com.ung8023.datatype.pkg.pkg1.Pkg as Pkg1
import com.ung8023.datatype.pkg.pkg3.Pkg as Pkg3

fun main(args: Array<String>) {
    val pkg: Pkg = Pkg()
    val pkg2: com.ung8023.datatype.pkg.pkg1.Pkg = com.ung8023.datatype.pkg.pkg1.Pkg()
    val pkg3: Pkg3 = Pkg3()
}
import org.gradle.script.lang.kotlin.extra
import org.gradle.script.lang.kotlin.repositories

buildscript {
    extra["kotlin_version"] = "1.2.10"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin_version"]}")
        //allopen 与noarg
        classpath("org.jetbrains.kotlin:kotlin-noarg:${extra["kotlin_version"]}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${extra["kotlin_version"]}")
    }
}

group = "ung8023.com"
version = "1.0-SNAPSHOT"

apply{
    plugin("java")
    plugin("kotlin")
//导出可执行程序
    plugin("application")
//noarg allopen
    plugin("kotlin-noarg")
    plugin("kotlin-allopen")
}

configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
}

noArg{
    annotation("com.ung8023.oop.annotations.Poko")
}

allOpen{
    annotation("com.ung8023.oop.annotations.Poko")
}

mainClassName = "com.ung8023.syntax.CalcKt"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${extra["kotlin_version"]}")
    testCompile (group = "junit", name = "junit", version = "4.12")
}

compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}
compileTestKotlin {
    kotlinOptions.jvmTarget = "1.8"
}


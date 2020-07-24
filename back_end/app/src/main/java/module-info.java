module project.app {
    requires jdk.unsupported;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires spring.beans;
    requires spring.boot.devtools;
    requires lombok;
    requires org.mapstruct.processor;

    requires project.base;
    requires project.lib;
    requires project.common;

    exports projectapp.runtime;
}

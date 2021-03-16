package com.github.monoanji.osmorc.services

import com.github.monoanji.osmorc.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.antoniminkiewicz.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.antoniminkiewicz.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

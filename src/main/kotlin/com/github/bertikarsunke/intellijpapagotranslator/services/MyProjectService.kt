package com.github.bertikarsunke.intellijpapagotranslator.services

import com.intellij.openapi.project.Project
import com.github.bertikarsunke.intellijpapagotranslator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.nsirons.itwillneverwork.services

import com.intellij.openapi.project.Project
import com.github.nsirons.itwillneverwork.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

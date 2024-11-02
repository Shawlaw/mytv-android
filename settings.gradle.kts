pluginManagement {
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/gradle-plugin/")
        }
        maven {
            url = uri("https://repo.huaweicloud.com/repository/maven/")
        }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/central/")
        }
        maven {
            url = uri("https://repo.huaweicloud.com/repository/maven/")
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "My TV"
include(":app")
 
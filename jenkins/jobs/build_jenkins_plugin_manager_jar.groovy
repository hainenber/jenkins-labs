pipelineJob('build-jenkins-plugin-manager-war') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/hainenber/automated-infrastructures.git')
          }
          branch('*/main')
        }
      }
      scriptPath('jenkins/pipelines/build_jenkins_plugin_manager_jar.Jenkinsfile')
      lightweight()
    }
  }
}
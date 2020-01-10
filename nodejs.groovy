job('NodeJS job') {
	scm {
		git('https://github.com/developer-mitsu/devops_sample_nodejs.git') { node ->
			node / gitConfigName('DSL User')
			node / gitConfigEmail('jenkins-dsl@example.com')
		}
	}
	triggers {
		scm('H/5 * * * *')
	}
	wrappers {
		nodejs('nodejs_v13')
	}
	steps {
		shell("npm install")
		shell("npm test")
	}
}


class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/index"(view:'/index')

        "/"(controller: 'startups', action: 'allStartups')
        "500"(view:'/error')
	}
}

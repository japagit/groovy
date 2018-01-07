//Config3.groovy

website {
	//default values
	url = "http://default.mycompany.com"
	port = 80
	user = "test"
}

environments {
	development {
		website {
			url = "http://dev.mycompany.com"
			port = 8080
		}
	}
	production {
		website {
			url = "http://www.mycompany.com"
			user = "prodUser"
		}
	}
}
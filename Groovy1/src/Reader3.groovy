
//defaults
def config = new ConfigSlurper().parse(new File('src/Config3.groovy').toURL())

assert config.website.url=="http://default.mycompany.com"
assert config.website.port==80
assert config.website.user=="test"

//development environment
config = new ConfigSlurper("development").parse(new File('src/Config3.groovy').toURL())

assert config.website.url=="http://dev.mycompany.com"
assert config.website.port==8080
assert config.website.user=="test"

//production environment
config = new ConfigSlurper("production").parse(new File('src/Config3.groovy').toURL())

assert config.website.url=="http://www.mycompany.com"
assert config.website.port==80
assert config.website.user=="prodUser"
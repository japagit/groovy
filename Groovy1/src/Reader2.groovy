
def config = new ConfigSlurper().parse(new File('src/Config2.groovy').toURL())

assert "Aaron Rodgers" == config.teams.packers.quarterback
assert ["Greg Jennings", "Donald Driver"] == config.teams.packers.recievers
assert "Brett Favre" == config.teams.vikings.quarterback
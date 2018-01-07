
def config = new ConfigSlurper().parse(new File('src/Config4.groovy').toURL())

assert 4 == config.calculation
assert 8 == config.calc2

assert 32 == config.doubling

//merge config files
def config1 = new ConfigSlurper().parse(new File('src/Config1.groovy').toURL())
def config2 = new ConfigSlurper().parse(new File('src/Config2.groovy').toURL())
config1 = config1.merge(config2)
assert 42 == config1.numberProperty
assert "Aaron Rodgers" == config1.teams.packers.quarterback
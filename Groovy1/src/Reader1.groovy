
def config = new ConfigSlurper().parse(new File('src/Config1.groovy').toURL())

assert "Some string" == config.stringProperty
assert config.stringProperty.class == String

assert 42 == config.numberProperty
assert config.numberProperty.class == Integer

assert false == config.booleanProperty
assert config.booleanProperty.class == Boolean

assert ["Monday", "Tuesday", "Wednesday"] == config.listProperty
assert 3 == config.listProperty.size()
assert config.listProperty.class == ArrayList

println (config.listProperty)

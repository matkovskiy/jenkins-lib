def call(String name) {
  return "Hello ${name}"
}

def call2() {
  return UUID.randomUUID().toString().split('-').join('\n')
}

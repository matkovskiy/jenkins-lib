def call(String name) {
  echo "Hello ${name}"
}

def call2() {
  return UUID.randomUUID().toString().split('-').join('\n')
}

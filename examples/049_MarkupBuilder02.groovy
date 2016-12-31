def writer = new StringWriter()
def doc = new groovy.xml.MarkupBuilder(writer)
doc.html() {
    head {
        title("HelloWorld demo") 
    }
    body {
        h1("Hello World!")
        p(style:'font-style:italic', "Generated by Groovy at ${new Date().dateTimeString}")
    }
}
println writer

# Groovy NullPointerException in Loosely Typed Methods

This repository demonstrates a common issue in Groovy: unexpected `NullPointerException`s arising from the language's loose typing.  The `myMethod` function is designed to add two numbers; however, it lacks explicit null checks and will return `null` rather than throwing an exception if either input is `null`. While this might seem harmless, it can mask errors and lead to difficult-to-debug problems later in a larger application.

The solution shows how to improve the method to handle `null` inputs more gracefully, either by throwing an exception or returning a default value.

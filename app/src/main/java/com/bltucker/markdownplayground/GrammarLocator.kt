package com.bltucker.markdownplayground

import io.noties.prism4j.annotations.PrismBundle


@PrismBundle(include = ["kotlin", "java"], grammarLocatorClassName = ".ExampleGrammarLocator")
class GrammarLocator {
}
package io.fluent

open class Type {
  object Initial : Type()
  object Loading : Type()
  object Success : Type()
  object Error : Type()
}
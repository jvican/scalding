package com.twitter.scalding.macros

import scala.language.experimental.macros

import com.twitter.scalding._
import com.twitter.scalding.macros.impl._
import com.twitter.bijection.macros.IsCaseClass

object MacroImplicits {
  /**
   * This method provides proof that the given type is a case class.
   */
  implicit def materializeCaseClassTupleSetter[T: IsCaseClass]: TupleSetter[T] = macro TupleSetterImpl.caseClassTupleSetterImpl[T]
  implicit def materializeCaseClassTupleConverter[T: IsCaseClass]: TupleConverter[T] = macro TupleConverterImpl.caseClassTupleConverterImpl[T]
}

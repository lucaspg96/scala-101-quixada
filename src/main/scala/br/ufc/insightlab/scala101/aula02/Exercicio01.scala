package br.ufc.insightlab.scala101.aula02

object Exercicio01 extends App{

  // 1. Implemente a função *postOrder* para que ela percorra uma árvore (cuja estrutura está definida abaixo) em pós-ordem.
  // OBS: Para percorrer uma árvore em pós ordem tem-se de:
  //    * percorrer a sub-árvore esquerda em pós-ordem
  //    * percorrer a sub-árvore direita em pós-ordem
  //    * visitar a raíz

  abstract class Tree[T]

  case class Leaf[T](elem: T) extends Tree[T]
  case class Fork[T](elem: T, left: Tree[T], right: Tree[T]) extends Tree[T]

  def postOrder[T](tree: Tree[T]): String = ???

  val t = Fork(5,
    Fork(3,Leaf(2), Leaf(1)),
    Fork(7,Leaf(9), Leaf(8))
  )

  require(postOrder(t) == "2,1,3,9,8,7,5")

}

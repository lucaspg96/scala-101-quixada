package br.ufc.insightlab.scala101.aula02

object Exercicio02 extends App{

  // 2. Vamos definir o tipo Conjunto como uma função que recebe um inteiro e retorna um booleano.
  // Se um elemento pertencer ao conjunto, o retorno deverá ser true.
  // Caso contrário, false.
  // Implemente os métodos abaixo a fim de conseguir executar o código:

  type Set = Int => Boolean

  object Operador{
    def conjuntoUnitario(n: Int): Set =
      x => x == n

    def uniao(s: Set, t: Set): Set =
      x => s(x) || t(x)

    def interseccao(s: Set, t: Set): Set =
      x => s(x) && t(x)

    def diferenca(s: Set, t: Set): Set =
      x => s(x) && !t(x)

    def complemento(s: Set): Set =
      x => !s(x)
  }


  val s = Operador.conjuntoUnitario(2)
  val t = Operador.conjuntoUnitario(1)

  require(!s(1))
  require(s(2))
  require(!t(2))
  require(t(1))

  val u = Operador.uniao(s,t)

  require(u(1))
  require(u(2))
  require(!u(3))

  val i = Operador.interseccao(u,t)

  require(i(1))
  require(!i(2))
  require(!i(3))

  val d = Operador.diferenca(u,t)

  require(d(2))
  require(!d(1))
  require(!d(3))

  val c = Operador.complemento(u)

  require(!c(1))
  require(!c(2))
  require(c(3))
  require(c(4))

  println("Parabéns! Sua implementação está correta!")

}

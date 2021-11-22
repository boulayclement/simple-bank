package fr.fpe.school
package api

import model.Account

final class AccountAPI() {

  def createAccount(name: String): Either[String, Account] = {
    for {
      _ <- Either.cond(name.length < 15, (), "Name length is superior to 15")
      _ <- Either.cond(!name.isBlank, (), "Name is blank")
    } yield {Account(name)}
  }

}

package com.github.pshirshov.izumi.workshop.w01

import com.github.pshirshov.izumi.distage.roles.roles.RoleService

class UsersRole extends RoleService{
  override def start(): Unit = {
    println("Hi!")
  }
}

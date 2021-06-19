package com.example.hiltlecture.data

import javax.inject.Inject
import javax.inject.Singleton

//hilt로 객체를 주입시킬 당사자가 되는 곳에 @Inject constructor()를 붙여준다
@Singleton //주입시킬 당사자를 sigleton형태로 쓰겠다 (객체는 보통 만들어질때마다 새로운 자원을 할당하며 만들어지는데 이렇게하면 하나로 씀)
class MyRepository @Inject constructor() {

}
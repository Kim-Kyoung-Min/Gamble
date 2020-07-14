﻿package gamble;
import java.io.IOException;

//package miniproject;

public abstract class Monster { // 수련몬스터
	int hp ;
	int attackDamage ;
	int exp;
	int coin;
	
	Monster(){
		this.exp=3;
		this.coin=5;
	}
	
	abstract public int getExp();
	public abstract int monsterHp ();
	public abstract int getCoin();
	public abstract boolean subHp(int hp);
	public abstract int battleAttack(int userHp) throws InterruptedException;
	public abstract String[] getReword() throws IOException;

}

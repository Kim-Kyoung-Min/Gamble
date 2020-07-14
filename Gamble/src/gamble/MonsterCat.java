﻿package gamble;
import java.io.IOException;

//package miniproject;

public class MonsterCat extends Monster { // 수련몬스터 Cat(A)
	double dice = 0;
	private int coin=0;

	MonsterCat() {
		this.hp = 10;
		this.coin=5;
	}

	public int getExp() { // 경험치를 돌려준다.
		return exp;
	}
	public int getCoin() {
		return coin;
	}
	public int monsterHp() {
		return hp;
	}

	public boolean subHp(int hp) {
		this.hp = hp;
		
		if (this.hp <= 0) {
			return false;
		}
		else if (this.hp>= 5000) {
			System.out.println("나약한놈..");
			return false;
		}
		return true;
	}
	public int mAttackDamageRandom() {
		return this.attackDamage=View.rd.nextInt(5)+3;
	}
	public int battleAttack(int userHp) throws InterruptedException {
		mAttackDamageRandom();
		mAttackSound();
		userHp = userHp -attackDamage;
		System.out.printf("%d데미지를 입혔습니다\n",attackDamage);
		if (userHp >= 0) {
			System.out.printf("유저의 hp가 %d 남았습니다\n", userHp);
		} else if (userHp < 0) {
			System.out.println("유저의 체력이 0이 되었습니다.");
			System.err.println("회복하고 다시 도전하세요");
		}
		return userHp;
	}
	public void mAttackSound() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("쿵!!");
	}

	@Override
	public String[] getReword() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
}



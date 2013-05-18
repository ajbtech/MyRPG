package com.lexicon.rpg;

public class Creature {
	private int level, currentHealth, armor, damage, maxHealth, block, experience;
	private double speed;
	
Creature(int level, int currentHealth, int maxHealth, int armor, int damage, 
		int block, double speed, int experience){
	this.level = level;
	this.currentHealth = currentHealth;
	this.maxHealth = maxHealth;
	this.armor = armor;
	this.damage = damage;
	this.block = block;
	this.speed = speed;
	this.experience = experience;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

public void addExperience(int addExperience) {
	experience += addExperience;
}

public int getLevel() {
	return level;
}

public void setLevel(int level) {
	this.level = level;
}

public int getCurrentHealth() {
	return currentHealth;
}

public void setCurrentHealth(int currentHealth) {
	this.currentHealth = currentHealth;
}

public void dealDamage(int damage){
	currentHealth -= damage;
}

public void heal(int heal){
	currentHealth += damage;
}

public int getArmor() {
	return armor;
}

public void setArmor(int armor) {
	this.armor = armor;
}

public int getDamage() {
	return damage;
}

public void setDamage(int damage) {
	this.damage = damage;
}

public int getMaxHealth() {
	return maxHealth;
}

public void setMaxHealth(int maxHealth) {
	this.maxHealth = maxHealth;
}

public int getBlock() {
	return block;
}

public void setBlock(int block) {
	this.block = block;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}


}



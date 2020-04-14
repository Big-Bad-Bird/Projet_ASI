package model;

import java.util.UUID;

public class CardModel {
	private String id;
	private String name;
	private String description;
	private String family;
	private int hp;
	private int energy;
	private int defence;
	private int attack;
	private String imgUrl;

	public CardModel(String name, String description, String family, int hp, int energy, int defence, int attack,
			String imgUrl) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.description = description;
		this.family = family;
		this.hp = hp;
		this.energy = energy;
		this.defence = defence;
		this.attack = attack;
		this.imgUrl = imgUrl;
	}

	public CardModel() {
		this.id = UUID.randomUUID().toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

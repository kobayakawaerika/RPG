package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	public Wizard(String name, String weapon) {
		super(name, weapon); // Humanクラスのコンストラクタを利用

		// ヒットポイント（HP）の初期化: 100〜200の間でランダムに設定
		this.hp = Dice.get(120, 180);

		//攻撃力の乱数:7〜13の間でランダムに設定
		this.offensive = Dice.get(12, 18);
	}
}

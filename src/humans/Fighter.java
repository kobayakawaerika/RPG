package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon) {
		super(name, weapon); // Humanクラスのコンストラクタを利用
		
        // ヒットポイント（HP）の初期化: 100〜200の間でランダムに設定
        this.hp = Dice.get(240, 300);
        
        //攻撃力の乱数:7〜13の間でランダムに設定
        this.offensive = Dice.get(17, 23);
	}
}
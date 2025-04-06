package com.game;
import com.game.core.Game;
import com.game.model.Piece;
import com.game.model.Player;
public class start_game {
    public static void main(String[] args) {
        // 初始化两个玩家，棋子符号分别为黑色和白色
        Player player1 = new Player("fred", Piece.BLACK);
        Player player2 = new Player("bright", Piece.WHITE);
        
        // 创建 Game 类的实例，实现独立回合管理
        Game game = new Game(player1, player2);
        
        // 开始游戏
        game.start();
    }
    
}
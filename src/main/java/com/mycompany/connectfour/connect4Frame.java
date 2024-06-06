package com.mycompany.connectfour;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Laith Alhalabi
 */
class Move {

    private final int row;
    private final int col;

    Move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}

public class connect4Frame extends javax.swing.JFrame {
    
    private final int rows = 6;
    private final int cols = 7;
    private final int[][] board = new int[rows][cols];
    private boolean playerOneTurn;
    private final ArrayList<Move> lastMovesPlayerOne = new ArrayList();
    private final ArrayList<Move> lastMovesPlayerTwo = new ArrayList();
    private int AiScore = 0;
    private int PlayerScore = 0;
    public connect4Frame() {
        initComponents();
        resetBoard();
    }

    void paint() {
        boardPanel.removeAll();
        boardPanel.setLayout(new GridLayout(rows, cols));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JPanel cell = new JPanel();
                switch (board[i][j]) {
                    case 0:
                        cell.setBackground(Color.black);
                        break;
                    case 1:
                        cell.setBackground(Color.red);
                        break;
                    default:
                        cell.setBackground(Color.yellow);
                        break;
                }
                // cell.setHorizontalAlignment(SwingConstants.CENTER);
                cell.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                boardPanel.add(cell);
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        boardPanel.revalidate();
        boardPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        boardPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        difficultyComboBox = new javax.swing.JComboBox<>();
        undo = new javax.swing.JButton();
        resetBoard = new javax.swing.JButton();
        ScoreAi = new javax.swing.JLabel();
        ScorePlayer = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boardPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        titleLabel.setBackground(new java.awt.Color(0, 255, 255));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Connect - 4");

        jButton1.setText("Drop");
        jButton1.setAutoscrolls(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Drop");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Drop");
        jButton3.setAutoscrolls(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Drop");
        jButton4.setAutoscrolls(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Drop");
        jButton5.setAutoscrolls(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Drop");
        jButton6.setAutoscrolls(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Drop");
        jButton7.setAutoscrolls(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        difficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));
        difficultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyComboBoxActionPerformed(evt);
            }
        });

        undo.setText("undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        resetBoard.setText("Reset Board");
        resetBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBoardActionPerformed(evt);
            }
        });

        ScoreAi.setText("Ai Score : 0");

        ScorePlayer.setText("Player Score : 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(ScorePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(difficultyComboBox, 0, 89, Short.MAX_VALUE)
                            .addComponent(ScoreAi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boardPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ScoreAi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScorePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleName("");
        jButton2.getAccessibleContext().setAccessibleName("");
        jButton3.getAccessibleContext().setAccessibleName("");
        jButton4.getAccessibleContext().setAccessibleName("");
        jButton5.getAccessibleContext().setAccessibleName("");
        jButton6.getAccessibleContext().setAccessibleName("");
        jButton7.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dropDisc(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dropDisc(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dropDisc(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dropDisc(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dropDisc(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dropDisc(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dropDisc(6);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void difficultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyComboBoxActionPerformed
        // Reset the board whenever the difficulty level is changed
        resetBoard();
    }//GEN-LAST:event_difficultyComboBoxActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        if(!lastMovesPlayerOne.isEmpty()&& !lastMovesPlayerTwo.isEmpty()){
            Move MoveOfPlayerOne =  lastMovesPlayerOne.remove(lastMovesPlayerOne.size()-1);
            Move MoveOfPlayerTwo =  lastMovesPlayerTwo.remove(lastMovesPlayerTwo.size()-1);
            board[MoveOfPlayerOne.getRow()][MoveOfPlayerOne.getCol()] = 0;
            board[MoveOfPlayerTwo.getRow()][MoveOfPlayerTwo.getCol()] = 0;
            paint();
        } 
    }//GEN-LAST:event_undoActionPerformed

    private void resetBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBoardActionPerformed
        resetBoard();
    }//GEN-LAST:event_resetBoardActionPerformed

    // GAME LOGIC
    void dropDisc(int col) {
        int[] finalRow = {0}; // to start from first row
        if(getNextOpenRow(col) == -1){
            return;
        }
        Timer timer = new Timer(30, null);
        ActionListener listener = e -> {
            if (finalRow[0] > 0) {
                board[finalRow[0] - 1][col] = 0; // backTrack from last move to make animation
            }
            if (finalRow[0] < rows && (finalRow[0] == rows - 1 || board[finalRow[0] + 1][col] != 0)) {
                board[finalRow[0]][col] = playerOneTurn ? 1 : 2;
                paint();
                timer.stop(); // stop when this is the last empty place
                
                if (playerOneTurn) {
                    lastMovesPlayerOne.add(new Move(finalRow[0], col));
                } else {
                    lastMovesPlayerTwo.add(new Move(finalRow[0], col));
                }
                
                if (checkWin(finalRow[0], col)) {
                    playSound(playerOneTurn ? "winner-dinner.wav":"loser.wav");
                    JOptionPane.showMessageDialog(null, "Player " + (playerOneTurn ? "Red" : "Yellow") + " wins!");
                    if(playerOneTurn){
                        ScorePlayer.setText("Player Score : "+ ++PlayerScore);
                    }
                    else{
                        ScoreAi.setText("Ai Score : " + ++AiScore);
                    }
                    
                    resetBoard();
                    timer.stop();
                } else if (isBoardFull()) {
                    playSound("draw-no.wav");
                    JOptionPane.showMessageDialog(null, "It's a draw!");
                    resetBoard();
                    timer.stop();
                }
                else{
                    playSound("drop_disc.wav");
                    playerOneTurn = !playerOneTurn;

                    if (!playerOneTurn) {
                        int bestMove = findBestMove();
                        dropDisc(bestMove);
                    }
                }
            } else {
                board[finalRow[0]][col] = playerOneTurn ? 1 : 2;
                paint();
                finalRow[0]++; // try secound row
            }
        };
        timer.addActionListener(listener);
        timer.start();
    }

    private void playSound(String soundFile) {
        AudioInputStream aui;
        String FilePath = "src\\main\\java\\resources\\" + soundFile;
        try {
            aui = AudioSystem.getAudioInputStream(new File(FilePath).getAbsoluteFile());
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(aui);
                clip.start();
            } catch (Exception e) {
            }            
        } catch (Exception e) {
        }
    }
    
    private boolean checkWin(int row, int col) {
        int player = board[row][col];
        return checkDirection(row, col, player, 1, 0)
                || // horizontal
                checkDirection(row, col, player, 0, 1)
                || // vertical
                checkDirection(row, col, player, 1, 1)
                || // diagonal /
                checkDirection(row, col, player, 1, -1);  // diagonal \
    }

    private int getDifficultyDepth() {
        String difficulty = (String) difficultyComboBox.getSelectedItem();
        switch (difficulty) {
            case "Easy":
                return 3;
            case "Medium":
                return 5;
            case "Hard":
                return 7;
            default:
                return 5;
        }
    }

    private boolean checkDirection(int row, int col, int player, int rowDir, int colDir) {
        int count = 0;
        for (int i = -3; i <= 3; i++) {
            int r = row + i * rowDir;
            int c = col + i * colDir;
            if (r >= 0 && r < rows && c >= 0 && c < cols && board[r][c] == player) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int col = 0; col < cols; col++) {
            if (board[0][col] == 0) {
                return false;
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = 0;
            }
        }
        playerOneTurn = true;
        lastMovesPlayerOne.clear();
        lastMovesPlayerTwo.clear();
        paint();
    }

    // MINIMAX ALPHA BETA PRUNING
    private int minimax(int[][] board, int depth, boolean isMaximizingPlayer, int alpha, int beta) {
        int score = evaluateBoard(board);

        // Check for terminal state
        if (Math.abs(score) >= 1000 || depth == 0 || isBoardFull()) {
            return score;
        }

        if (isMaximizingPlayer) {
            int maxEval = Integer.MIN_VALUE;
            for (int col = 0; col < cols; col++) {
                int row = getNextOpenRow(col);
                if (row != -1) {
                    board[row][col] = 2; // Computer's move
                    int eval = minimax(board, depth - 1, false, alpha, beta);
                    board[row][col] = 0; // Undo move

                    maxEval = Math.max(maxEval, eval);
                    alpha = Math.max(alpha, eval);
                    if (beta <= alpha) {
                        break;
                    }
                }
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for (int col = 0; col < cols; col++) {
                int row = getNextOpenRow(col);
                if (row != -1) {
                    board[row][col] = 1; // Player's move
                    int eval = minimax(board, depth - 1, true, alpha, beta);
                    board[row][col] = 0; // Undo move

                    minEval = Math.min(minEval, eval);
                    beta = Math.min(beta, eval);
                    if (beta <= alpha) {
                        break;
                    }
                }
            }
            return minEval;
        }
    }

    private int evaluateBoard(int[][] board) {
        int score = 0;

        // أعط أولوية للموقع المركزي
        score += evaluateCenter(board);

        // تقييم الاتجاه الأفقي
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col <= cols - 4; col++) {
                int[] window = {board[row][col], board[row][col + 1], board[row][col + 2], board[row][col + 3]};
                score += evaluateWindow(window);
            }
        }

        // تقييم الاتجاه العمودي
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row <= rows - 4; row++) {
                int[] window = {board[row][col], board[row + 1][col], board[row + 2][col], board[row + 3][col]};
                score += evaluateWindow(window);
            }
        }

        // تقييم الاتجاه القطري (/) 
        for (int row = 0; row <= rows - 4; row++) {
            for (int col = 0; col <= cols - 4; col++) {
                int[] window = {board[row][col], board[row + 1][col + 1], board[row + 2][col + 2], board[row + 3][col + 3]};
                score += evaluateWindow(window);
            }
        }

        // تقييم الاتجاه القطري (\) 
        for (int row = 0; row <= rows - 4; row++) {
            for (int col = 3; col < cols; col++) {
                int[] window = {board[row][col], board[row + 1][col - 1], board[row + 2][col - 2], board[row + 3][col - 3]};
                score += evaluateWindow(window);
            }
        }

        return score;
    }

    private int evaluateCenter(int[][] board) {
        int score = 0;
        int centerCol = cols / 2;
        int centerCount = 0;

        for (int row = 0; row < rows; row++) {
            if (board[row][centerCol] == 2) {
                centerCount++;
            } else if (board[row][centerCol] == 1) {
                centerCount--;
            }
        }

        score += centerCount * 3;
        return score;
    }

    private int evaluateWindow(int[] window) {
        int score = 0;
        int playerOneCount = 0;
        int playerTwoCount = 0;
        int emptyCount = 0;

        for (int cell : window) {
            if (cell == 1) {
                playerOneCount++;
            } else if (cell == 2) {
                playerTwoCount++;
            } else {
                emptyCount++;
            }
        }

        if (playerTwoCount == 4) {
            score += 100000;
        } else if (playerTwoCount == 3 && emptyCount == 1) {
            score += 100;
        } else if (playerTwoCount == 2 && emptyCount == 2) {
            score += 10;
        }

        if (playerOneCount == 4) {
            score -= 100000;
        } else if (playerOneCount == 3 && emptyCount == 1) {
            score -= 100;
        } else if (playerOneCount == 2 && emptyCount == 2) {
            score -= 10;
        }

        return score;
    }

    private int getNextOpenRow(int col) {
        for (int row = rows - 1; row >= 0; row--) {
            if (board[row][col] == 0) {
                return row;
            }
        }
        return -1;
    }

    public int findBestMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestCol = -1;
        int depth = getDifficultyDepth();

        for (int col = 0; col < cols; col++) {
            int row = getNextOpenRow(col);
            if (row != -1) {
                board[row][col] = 2; // AI's move
                int score = minimax(board, depth, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                board[row][col] = 0; // Backtrack
                if (score > bestScore) {
                    bestScore = score;
                    bestCol = col;
                }
            }
        }
        return bestCol;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(connect4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(connect4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(connect4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(connect4Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new connect4Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ScoreAi;
    private javax.swing.JLabel ScorePlayer;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JComboBox<String> difficultyComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton resetBoard;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}



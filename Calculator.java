/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testcalculator30;
import javax.swing.Timer;

/**
 *
 * @author Abhishek
 */
public class Calculator extends javax.swing.JFrame {

    double a,b,c = 0;
    boolean decimalClick = true, equalClicked, clearForNextInput, minusFirstClick;
    boolean plusClick, minusClick, multiplyClick, divideClick, piClick, twoNumSqrClick, numSqrtClick, expClick; 
// Default val false
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
//        if(!display.getText().equals("")) zero.setVisible(true);
//        if(display.getText().equals("")) zero.setVisible(false);
        
//        else zero.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        nine = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        backSpace = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        reciprocal = new javax.swing.JButton();
        sqRoot = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        plusMinus = new javax.swing.JButton();
        sec = new javax.swing.JButton();
        square = new javax.swing.JButton();
        cosec = new javax.swing.JButton();
        log = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cot = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        exponential = new javax.swing.JButton();
        pie = new javax.swing.JButton();
        leftBracket = new javax.swing.JButton();
        rightBracket = new javax.swing.JButton();
        randomNum = new javax.swing.JButton();
        emptyBtn = new javax.swing.JButton();
        numRoot = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        expoNums = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abhishek Periya", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 14), new java.awt.Color(0, 204, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 559));

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 204, 255));
        display.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 0, 255));
        nine.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 0, 255));
        eight.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 0, 255));
        four.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(255, 0, 255));
        five.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 0, 255));
        six.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(255, 0, 255));
        one.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        one.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                oneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oneKeyTyped(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 0, 255));
        two.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 0, 255));
        three.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(153, 0, 255));
        clear.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 0, 255));
        seven.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        seven.setText("7");
        seven.setToolTipText("");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        backSpace.setBackground(new java.awt.Color(153, 0, 255));
        backSpace.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        backSpace.setText("BackSpace");
        backSpace.setToolTipText("");
        backSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceActionPerformed(evt);
            }
        });

        percentage.setBackground(new java.awt.Color(255, 0, 255));
        percentage.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        reciprocal.setBackground(new java.awt.Color(255, 0, 255));
        reciprocal.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        reciprocal.setText("1/x");
        reciprocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciprocalActionPerformed(evt);
            }
        });

        sqRoot.setBackground(new java.awt.Color(255, 0, 255));
        sqRoot.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        sqRoot.setText("√x");
        sqRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqRootActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(255, 0, 255));
        decimal.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(255, 0, 255));
        divide.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        divide.setText("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(102, 102, 255));
        plus.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(255, 0, 255));
        minus.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(255, 0, 255));
        multiply.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        multiply.setText("×");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 0, 255));
        zero.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(102, 255, 102));
        equal.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        plusMinus.setBackground(new java.awt.Color(255, 0, 255));
        plusMinus.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        plusMinus.setText("±");
        plusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusActionPerformed(evt);
            }
        });

        sec.setBackground(new java.awt.Color(255, 0, 255));
        sec.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        sec.setText("Sec");
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });

        square.setBackground(new java.awt.Color(255, 0, 255));
        square.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        square.setText("x²");
        square.setToolTipText("");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        cosec.setBackground(new java.awt.Color(255, 0, 255));
        cosec.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cosec.setText("Csc");
        cosec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosecActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(255, 0, 255));
        log.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        log.setText("Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(255, 0, 255));
        sin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        sin.setText("Sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cot.setBackground(new java.awt.Color(255, 0, 255));
        cot.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cot.setText("Cot");
        cot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(255, 0, 255));
        tan.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        tan.setText("Tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(255, 0, 255));
        cos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cos.setText("Cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        factorial.setBackground(new java.awt.Color(255, 0, 255));
        factorial.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        factorial.setText("n!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        exponential.setBackground(new java.awt.Color(255, 0, 255));
        exponential.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        exponential.setText("e");
        exponential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponentialActionPerformed(evt);
            }
        });

        pie.setBackground(new java.awt.Color(255, 0, 255));
        pie.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        pie.setText("π");
        pie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieActionPerformed(evt);
            }
        });

        leftBracket.setBackground(new java.awt.Color(255, 0, 255));
        leftBracket.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        leftBracket.setText("(");
        leftBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBracketActionPerformed(evt);
            }
        });

        rightBracket.setBackground(new java.awt.Color(255, 0, 255));
        rightBracket.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        rightBracket.setText(")");
        rightBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBracketActionPerformed(evt);
            }
        });

        randomNum.setBackground(new java.awt.Color(255, 0, 255));
        randomNum.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        randomNum.setText("Rdm");
        randomNum.setVerifyInputWhenFocusTarget(false);
        randomNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomNumActionPerformed(evt);
            }
        });

        emptyBtn.setBackground(new java.awt.Color(255, 0, 255));
        emptyBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        emptyBtn.setText("?");
        emptyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyBtnActionPerformed(evt);
            }
        });

        numRoot.setBackground(new java.awt.Color(255, 0, 255));
        numRoot.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        numRoot.setText("y√x");
        numRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numRootActionPerformed(evt);
            }
        });

        mod.setBackground(new java.awt.Color(255, 0, 255));
        mod.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mod.setText("|x|");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        expoNums.setBackground(new java.awt.Color(255, 0, 255));
        expoNums.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        expoNums.setText("x^y");
        expoNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expoNumsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exponential, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(plusMinus, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sqRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reciprocal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(log)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cot)
                                            .addComponent(sec)
                                            .addComponent(numRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cosec))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(leftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expoNums, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(randomNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emptyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(display)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exponential, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosec, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(randomNum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emptyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expoNums, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(numRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightBracket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftBracket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sqRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reciprocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed

    }//GEN-LAST:event_displayActionPerformed
    private void toggleFalse(){
        decimalClick = false;
        divideClick = false;
        multiplyClick = false;
        plusClick = false;
        minusClick = false;
        piClick = false;
        numSqrtClick = false;
        twoNumSqrClick = false;
        expClick = false;
        clearForNextInput = false;
        equalClicked = false;
    }
    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        display.setText(display.getText()+nine.getText());
        if(clearForNextInput){
            display.setText("" + nine.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_nineActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        display.setText(display.getText()+eight.getText());
        if(clearForNextInput){
            display.setText("" + eight.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_eightActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        display.setText(display.getText()+four.getText());
        if(clearForNextInput){
            display.setText("" + four.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        display.setText(display.getText()+five.getText());
        if(clearForNextInput){
            display.setText("" + five.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        display.setText(display.getText()+six.getText());
        if(clearForNextInput){
            display.setText("" + six.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_sixActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        display.setText(display.getText()+two.getText());
        if(clearForNextInput){
            display.setText("" + two.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        display.setText(display.getText()+three.getText());
        if(clearForNextInput){
            display.setText("" + three.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_threeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display.setText("");
        decimalClick = true;
    }//GEN-LAST:event_clearActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        display.setText(display.getText()+seven.getText());
        if(clearForNextInput){
            display.setText("" + seven.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSpaceActionPerformed
        String text = display.getText();
        if (text.length() > 0) display.setText(text.substring(0, text.length() - 1));
        if(equalClicked){
            display.setText("");
            equalClicked = false;
        }
    }//GEN-LAST:event_backSpaceActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
//        percentageClicked = true;
        a = Double.parseDouble(display.getText());
        display.setText(doubleIntConv(a)+"%");
//        try{
//            Thread.sleep(500);
//            a /= 100;
//            display.setText("");
//            multiplyClick = true;
//        }catch(InterruptedException e){}

        Timer timer = new Timer(500, e -> {
            display.setText(""); 
            a /= 100;
            multiplyClick = true;
        });
        timer.setRepeats(false); 
        timer.start();
        clearForNextInput = true;
    
    }//GEN-LAST:event_percentageActionPerformed

    private void reciprocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciprocalActionPerformed
        double recp = Double.parseDouble(display.getText());
        display.setText(String.valueOf(1.0/recp));
        clearForNextInput = true;
    }//GEN-LAST:event_reciprocalActionPerformed

    private void sqRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqRootActionPerformed
        double rootX = Math.sqrt(Double.parseDouble(display.getText()));
        display.setText(doubleIntConv(rootX));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_sqRootActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        if(decimalClick){
            if(display.getText().equals("")) display.setText("0.");
            else display.setText(display.getText()+decimal.getText());
            decimalClick = false;
        }
        clearForNextInput = false;
    }//GEN-LAST:event_decimalActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        a = Double.parseDouble(display.getText());
        display.setText(display.getText()+("÷"));
        toggleFalse();
        decimalClick = true;
        divideClick = true;
    }//GEN-LAST:event_divideActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        a = Double.parseDouble(display.getText());
        display.setText(display.getText()+("+"));
        toggleFalse();
        decimalClick = true;
        plusClick = true;
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if(display.getText() == "-") minusFirstClick = true;
//        if(display.getText().charAt(0) == '-'){
//            display.setText(minus.getText());
//            String text = display.getText();
//            int numberTill = 0;
//            for(int i = 1; i<text.length(); i++){
//                if(text.charAt(i) == 'X' || text.charAt(i) == '÷' || text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '√' || text.charAt(i) == '^'){
//                    numberTill = i - 1 ; 
//                    break;
//                }
//            }
//            a = Double.parseDouble(text.substring(1,numberTill));
//            a *= -1;
//            decimalClick = true;
//            minusClick = true;
//            multiplyClick = false;
//            plusClick = false;
//            divideClick = false;
//            piClick = false;
//            twoNumSqrClick = false;
//            expClick = false;
//        }
            if(minusFirstClick){
                if(display.getText().isEmpty()) display.setText("-");
                else display.setText(display.getText()+minus.getText());
                a = Double.parseDouble(display.getText());
                a *= -1;
                minusFirstClick = false;
                clearForNextInput = false;
            }
        
        else{   
            a = Double.parseDouble(display.getText());
            display.setText(display.getText()+("-"));
            toggleFalse();
            decimalClick = true;
            minusClick = true;
        }
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        a = Double.parseDouble(display.getText());
        display.setText(display.getText()+("X"));
        toggleFalse();
        decimalClick = true;
        multiplyClick = true;
    }//GEN-LAST:event_multiplyActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!display.getText().equals("")) display.setText(display.getText()+zero.getText());
        if(clearForNextInput){
            display.setText("" + zero.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        String text = display.getText();
        int secondNumIndex = 0;
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i) == 'X' || text.charAt(i) == '÷' || text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '√' || text.charAt(i) == '^'){
                secondNumIndex = i + 1; 
                break;
            }
        }
        if(expClick){
            b = Math.E;
            expClick = false;
        }else if (piClick){
            b = Math.PI;
            piClick = false;
            clearForNextInput = true;
        }else b  = Double.parseDouble(text.substring(secondNumIndex));
        if(plusClick){
            c = a + b;
            plusClick = false;
            clearForNextInput = true;
        }
        else if(minusClick){
            c = a - b;
            minusClick = false;
            clearForNextInput = true;
        }
        else if(multiplyClick){
            c = a * b;
            multiplyClick = false;
            clearForNextInput = true;
        }
        else if(divideClick){
            try{
                if(divideClick && b == 0) throw new ArithmeticException("Division by Zero");
                c = a / b;
                divideClick = false;
                clearForNextInput = true;
            }
            catch (ArithmeticException e) {
                display.setText("Go and repeat your school, mate!! :)");
                divideClick = false;
                clearForNextInput = true;   
                return;
            }
        }
        else if(twoNumSqrClick){
            c = Math.pow(a, b);
            twoNumSqrClick = false;
            clearForNextInput = true;
        }
        else if(numSqrtClick){
            c = Math.pow(b, 1.0/a);
            numSqrtClick = false;
            clearForNextInput = true;
        }
        display.setText(doubleIntConv(c));
        equalClicked = true;    //backspace pe ek sath sab hata dega
        decimalClick = true;
    }//GEN-LAST:event_equalActionPerformed

    private String doubleIntConv(double c) {
        if (c == Math.floor(c)) return String.valueOf((int) c); 
        else return String.valueOf(c);
    }
    
    private void plusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusActionPerformed
        if(decimalClick){
            int value = Integer.parseInt(display.getText());
            display.setText(doubleIntConv(-value));
        }
        else{
            double value = Double.parseDouble(display.getText());
            display.setText(doubleIntConv(-value));
        }
        clearForNextInput = true;
    }//GEN-LAST:event_plusMinusActionPerformed

    private void secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
       a = Double.parseDouble(display.getText());
        c = 1 / Math.cos(Math.toRadians(a));
        display.setText("sec("+doubleIntConv(a)+"): \n"+doubleIntConv(c));
        clearForNextInput = true;
    }//GEN-LAST:event_secActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        double sqr = Math.pow(Double.parseDouble(display.getText()),2);
        display.setText(doubleIntConv(sqr));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_squareActionPerformed

    private void cosecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosecActionPerformed
        a = Double.parseDouble(display.getText());
        c = 1 / Math.sin(Math.toRadians(a));
        display.setText("cosec("+doubleIntConv(a)+"): \n"+doubleIntConv(c));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_cosecActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        display.setText(String.valueOf(doubleIntConv(Math.log10(Double.parseDouble(display.getText())))));
        equalClicked = true;
        clearForNextInput = true;
    }//GEN-LAST:event_logActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        a = Double.parseDouble(display.getText());
        c = Math.sin(Math.toRadians(a));
        display.setText("sin("+doubleIntConv(a)+"): \n"+doubleIntConv(c));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_sinActionPerformed

    private void cotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotActionPerformed
        a = Double.parseDouble(display.getText());
        c = 1 / Math.tan(Math.toRadians(a));
        display.setText("cot("+doubleIntConv(a)+"): \n"+doubleIntConv(c));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_cotActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        a = Double.parseDouble(display.getText());
        c = Math.tan(Math.toRadians(a));
        display.setText("tan("+doubleIntConv(a)+"): \n"+doubleIntConv(c));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_tanActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        a = Double.parseDouble(display.getText());
        c = Math.cos(Math.toRadians(a));
        display.setText("cos("+doubleIntConv(a)+"): \n"+doubleIntConv(c));
        equalClicked = true;
        decimalClick = true;
        clearForNextInput = true;
    }//GEN-LAST:event_cosActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        a = Double.parseDouble(display.getText());
        display.setText(doubleIntConv(factorial(a)));
        equalClicked = true;
        clearForNextInput = true;
    }//GEN-LAST:event_factorialActionPerformed
    
    double factorial(double n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    private void exponentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponentialActionPerformed
        if(display.getText().isEmpty()) display.setText(doubleIntConv(Math.E));
        else{
            String text = display.getText();
            int firstNumIndex = 0;
            for(int i = 0; i<text.length(); i++){
                if(text.charAt(i) == 'X' || text.charAt(i) == '÷' || text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '√' || text.charAt(i) == '^'){
                    firstNumIndex = i; 
                    break;
                }
            }
            a = Double.parseDouble(text.substring(0,firstNumIndex));
            if(plusClick) display.setText(doubleIntConv(a)+"+e");
            else if(minusClick) display.setText(String.valueOf(a)+"-e");
            else if(multiplyClick) display.setText(String.valueOf(a)+"Xe");
            else if(divideClick) display.setText(String.valueOf(a)+"÷e");
        }
        expClick = true;
    }//GEN-LAST:event_exponentialActionPerformed

    private void pieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieActionPerformed
        if(display.getText().isEmpty()) display.setText(doubleIntConv(Math.PI));
        else{
            String text = display.getText();
            int firstNumIndex = 0;
            for(int i = 0; i<text.length(); i++){
                if(text.charAt(i) == 'X' || text.charAt(i) == '÷' || text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '√' || text.charAt(i) == '^'){
                    firstNumIndex = i; 
                    break;
                }
            }
            a = Double.parseDouble(text.substring(0,firstNumIndex));
            if(plusClick) display.setText(doubleIntConv(a)+"+π");
            else if(minusClick) display.setText(String.valueOf(a)+"-π");
            else if(multiplyClick) display.setText(String.valueOf(a)+"Xπ");
            else if(divideClick) display.setText(String.valueOf(a)+"÷π");
        }
        piClick = true;
    }//GEN-LAST:event_pieActionPerformed

    private void leftBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBracketActionPerformed
        display.setText(display.getText()+"(");
    }//GEN-LAST:event_leftBracketActionPerformed

    private void rightBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBracketActionPerformed
        display.setText(display.getText()+")");
    }//GEN-LAST:event_rightBracketActionPerformed

    private void randomNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomNumActionPerformed
        display.setText(String.valueOf((int)(Math.random()*1000)));
        clearForNextInput = true;
    }//GEN-LAST:event_randomNumActionPerformed

    private void numRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numRootActionPerformed
        a = Double.parseDouble(display.getText());
        display.setText(display.getText()+("√"));
        Timer timer = new Timer(500, e -> {
            display.setText("");
            toggleFalse();
            numSqrtClick = true;
            decimalClick = true;
            clearForNextInput = true;
        });
        timer.setRepeats(false); 
        timer.start();
    }//GEN-LAST:event_numRootActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        a = Double.parseDouble(display.getText());
        if(a<0){
            a *= -1; 
            display.setText(doubleIntConv(a));
        }
        else display.setText(doubleIntConv(a));
        clearForNextInput = true;
    }//GEN-LAST:event_modActionPerformed

    private void expoNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expoNumsActionPerformed
        a = Double.parseDouble(display.getText());
        display.setText(display.getText()+("^"));
        Timer timer = new Timer(500, e -> {
            display.setText("");
            toggleFalse();
            twoNumSqrClick = true;
            decimalClick = true;
            clearForNextInput = true;
        });
        timer.setRepeats(false); 
        timer.start();
    }//GEN-LAST:event_expoNumsActionPerformed

    private void emptyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emptyBtnActionPerformed

    private void oneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oneKeyTyped

    }//GEN-LAST:event_oneKeyTyped

    private void oneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_oneKeyReleased

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        display.setText(display.getText()+one.getText());
        if(clearForNextInput){
            display.setText("" + one.getText());
            clearForNextInput = false;
        }
    }//GEN-LAST:event_oneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backSpace;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosec;
    private javax.swing.JButton cot;
    private javax.swing.JButton decimal;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton emptyBtn;
    private javax.swing.JButton equal;
    private javax.swing.JButton expoNums;
    private javax.swing.JButton exponential;
    private javax.swing.JButton factorial;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leftBracket;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton numRoot;
    private javax.swing.JButton one;
    private javax.swing.JButton percentage;
    private javax.swing.JButton pie;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusMinus;
    private javax.swing.JButton randomNum;
    private javax.swing.JButton reciprocal;
    private javax.swing.JButton rightBracket;
    private javax.swing.JButton sec;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqRoot;
    private javax.swing.JButton square;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

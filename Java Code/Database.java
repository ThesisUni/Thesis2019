package com.example.thesisapp;

import java.util.ArrayList;

/**
 * Contains information that is stored by the application throughout one trial.
 */

public class Database {
    private static int overconfidenceCounter = 0;
    private static int statusQuoCounter = 0;
    private static String investmentStyle;
    private static String currentOppertunity;
    private static ArrayList<Double> initialInvestments = new ArrayList<>();
    private static ArrayList<Double> newInvestments = new ArrayList<>();
    private static int startState;
    private static boolean firstConditionTaken = false;
    private static boolean secondConditionTaken = false;
    private static double previouslyEnteredInvestmentValue = 0;

    /**
     * updates the internal counter that keeps track of overconfidence answers in the classification part.
     *
     * @param score the value is 1 which represents an overconfidence answer
     */
    public static void updateOverconfidenceCounter(int score) {
        overconfidenceCounter = overconfidenceCounter + score;
    }

    /**
     * updates the internal counter that keeps track of status quo answers in the classification part.
     *
     * @param score the value is 1 which represents an status quo answer
     */
    public static void updateStatusQuoCounter(int score) {
        statusQuoCounter = statusQuoCounter + score;
    }

    /**
     * @return the total overconfidence score
     */
    public static int getOverconfidenceCounter() {
        return overconfidenceCounter;
    }

    /**
     * @return the total status quo score
     */
    public static int getStatusQuoCounter() {
        return statusQuoCounter;
    }

    /**
     * @return the current investment opperunity that is being used in the interaction process
     */
    public static String getOppertunity() {
        return currentOppertunity;
    }

    /**
     * Sets the investment oppertunity that is to be used in the interaction process.
     *
     * @param oppertunity The to-be-used investment oppertunity
     */
    public static void setOppertunity(String oppertunity) {
        currentOppertunity = oppertunity;
    }


    /**
     * @return the investment style of the user
     */
    public static String getInvestmentStyle() {
        return investmentStyle;
    }


    /**
     * @param style Sets the investment style of the user
     */
    public static void setInvestmentStyle(String style) {
        investmentStyle = style;
    }

    /**
     * sets the investment in the first condition
     *
     * @param investment an investment in the first condition
     */
    public static void addInitialInvestment(Double investment) {
        initialInvestments.add(investment);
    }

    /**
     * Return an investment in from the first condition
     *
     * @param index the investment that is to be retrieved.
     * @return The requested investment
     */
    public static Double getInitialInvestment(int index) {
        return initialInvestments.get(index);
    }

    /**
     * sets the investment in the second condition
     *
     * @param investment an investment in the second condition
     */
    public static void addNewInvestment(Double investment) {
        newInvestments.add(investment);
    }


    /**
     * Return an investment in from the second condition
     *
     * @param index the investment that is to be retrieved.
     * @return The requested investment
     */
    public static Double getNewInvestment(int index) {
        return newInvestments.get(index);
    }

    /**
     * Returns the start condition for the interaction process
     *
     * @return The start condition for the interaction process
     */
    public static int getStartState() {
        return startState;
    }

    /**
     * Sets whether the user should start with the first or second condition.
     *
     * @param state The start condition for the interaction process
     */
    public static void setStartState(int state) {
        startState = state;
    }

    /**
     * @return returns whether the first condition has been taken.
     */
    public static boolean getFirstConditionTaken() {
        return firstConditionTaken;
    }

    /**
     * Can be used to set whether the first condition has been taken.
     *
     * @param state Sets whether the first condition has been taken.
     */
    public static void setFirstConditionTaken(boolean state) {
        firstConditionTaken = state;
    }

    ;

    /**
     * @return returns whether the ssecond condition has been taken.
     */
    public static boolean getSecondConditionTaken() {
        return secondConditionTaken;
    }

    /**
     * Can be used to set whether the second condition has been taken.
     *
     * @param state Sets whether the second condition has been taken.
     */
    public static void setSecondConditionTaken(boolean state) {
        secondConditionTaken = state;
    }

    ;

    /**
     * @return Returns the previous investment value.
     */
    public static double getPreviouslyEnteredInvestmentValue() {
        return previouslyEnteredInvestmentValue;
    }

    ;

    /**
     * @param value Set the previous investment value using this parameter.
     */
    public static void setPreviouslyEnteredInvestmentValue(double value) {
        previouslyEnteredInvestmentValue = value;
    }

    ;


}


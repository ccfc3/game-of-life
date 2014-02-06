package edu.macalester.comp124.life;

/**
 * RuleSet implementing Conway's Game of Life.
 *
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 */
public class HighLife implements RuleSet {

    public String getName() {
        return "Conway's Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount)
    {
        /* Any living cell with 2 or 3 neighbors stays alive*/

        if (isAlive == true)
        {
            if (neighborCount == 2 || neighborCount == 3)
            {
                return true;
            }
        }

        /*Any dead cell with exactly 3 or exactly 6 neighbors comes to life*/

        else if (neighborCount == 3 || neighborCount == 6)
        {
            return true;
        }

        /* All other cells die or stay dead */
        return false;
    }
}






















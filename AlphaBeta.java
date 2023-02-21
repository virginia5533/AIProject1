public class AlphaBeta {


/*
 * Psuedo code for minValue
 * function minValue (node, problem) returns integer
        if problem.Cutoff-Test (node.State) then return Utility(node.State, problem)
        v = infty
        for each action in problem.Actions (node.State) do
            v = min (v, maxValue (applyAction(node, action), problem))
    return v
 */

 /*
  * Psuedo code for maxValue
    function maxValue (node, problem) returns integer
        if problem.Cutoff-Test (node.State) then return Utility(node.State, problem)
        v = -infty
        for each action in problem.Actions (node.State) do
            v = max (v, minValue (applyAction(node, action), problem))
    return v
  */


    /* 
Psuedo code for Recursive AlphaBeta Pruning

function abSearch (problem) returns Action
    node = Make-Node(problem.Initial-State)
    alpha = -infty, beta = +infty, a = NULL
    for each action in problem.Actions (node.State) do
        alpha' = minValue (applyAction(node, action), problem, alpha, beta)
        if (alpha' > alpha) then alpha = alpha', a = action
    return a
    */


    
    

}

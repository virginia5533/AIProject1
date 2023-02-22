// import java.util.Vector;

// public class AIMove {

//     Vector<AIMove> availableMoves = new Vector<AIMove>();
//     public AIMove(int rowBoard, int colBoard) {

//         //int row = rowBoard;
//         //int col = colBoard;

//     }


//     //Mutates vector for available Moves
//     public void SetAvailableMoves(Vector<AIMove> initAvailableMoves){
//         availableMoves = initAvailableMoves;
//     }

//     public Vector<AIMove> GetAvailableMoves(){
//         return availableMoves;
//     }


//     public Vector<Integer> findAvailableMoves(int[][] board, int N){

//         Vector<AIMove> placeholder = new Vector<AIMove>();

//         for(int col = 0; col < N; col++){
//         for(int row = N; row >=0; row--){
//             if(board[row][col] == 0){
                
//                 //placeholder.add(AIMove(row,col));
//                 continue;
//             }
//             else if(board[0][col] != 0){
//                 break;
//             }

//         }
//     }


//         return GetAvailableMoves();
//     }
    
// }

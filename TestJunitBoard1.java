

	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.Test;
	/**
	 * 
	 */

	/**
	 * @author <K.ShanthiSai 2020501032>
	 *
	 */
	public class TestJunitBoard1 {
		@Test
		public void testBoardOne() {
			System.out.println("testBoardOne testcase started.");
			StringBuilder sb = new StringBuilder();
			sb.append(".*.*.*\n")
			.append("..*.*.\n")
			.append(".**.*.\n")
			.append("*.*..*\n")
			.append(".*..*.\n")
			.append("*.**.*\n");
			
			
			int s[][] = {{0,1},{0,3},{0,5},{1,2},{1,4},{2,1},{2,2},{2,4},{3,0},{3,2},{3,5},{4,1},{4,4},{5,0},
					{5,2},{5,3},{5,5}};
			Board1 b1 = new Board1();
			int sizeOfBoard = 6;
			Assertions.assertEquals(sb.toString(), b1.printBoard(b1.createBoard(sizeOfBoard, s)));
			System.out.println("======Board Test One Executed=====");
			System.out.println("testBoardOne testcase end. \n");
			}
		
		@Test
		public void testBoardTwo() {
			System.out.println("testBoardTwo testcase started.");
			StringBuilder sb2 = new StringBuilder();
			sb2.append("..***.\n")
			.append("....**\n")
			.append("..*.**\n")
			.append("*.*.**\n")
			.append("*...**\n")
			.append(".****.\n");
			int s[][] = {{0,1},{0,3},{0,5},{1,2},{1,4},{2,1},{2,2},{2,4},{3,0},{3,2},{3,5},{4,1},{4,4},{5,0},
					{5,2},{5,3},{5,5}};
			Board1 b2 = new Board1();
			int sizeOfBoard = 6;
			Assertions.assertEquals(sb2.toString(), b2.printBoard(b2.generateNextGeneration(b2.createBoard(sizeOfBoard, s))));
			System.out.println("======Board Test Two Executed=====");
			System.out.println("testBoardTwo testcase end. \n");
			}
		
		@Test
		public void testBoardThree() {
			System.out.println("testBoardThree testcase started.");
			StringBuilder sb3 = new StringBuilder();
			sb3.append("..***.\n")
			.append("....**\n")
			.append("..*.**\n")
			.append("*.*.**\n")
			.append("*...**\n")
			.append(".****.\n");
			int s[][] = {{0,2},{0,3},{0,4},{1,4},{1,5},{2,2},{2,4},{2,5},{3,0},{3,2},{3,4},{3,5},{4,0},{4,4},{4,5},{5,1},{5,2},{5,3},{5,4}};
			Board1 b3 = new Board1();
			int sizeOfBoard = 6;
			Assertions.assertEquals(sb3.toString(), b3.printBoard(b3.createBoard(sizeOfBoard, s)));
			System.out.println("======Board Test Three Executed=====");
			System.out.println("testBoardThree testcase end. \n");
			}
		}




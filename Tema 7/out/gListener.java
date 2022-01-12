// Generated from C:/GitHub/Limbaje-formale/Tema 7\g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#loopstatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopstatement(gParser.LoopstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#loopstatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopstatement(gParser.LoopstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(gParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(gParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(gParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(gParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(gParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(gParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(gParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(gParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(gParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(gParser.MainContext ctx);
}
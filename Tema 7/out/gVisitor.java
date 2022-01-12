// Generated from C:/GitHub/Limbaje-formale/Tema 7\g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#loopstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopstatement(gParser.LoopstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#selectionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionstatement(gParser.SelectionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(gParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(gParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(gParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(gParser.MainContext ctx);
}
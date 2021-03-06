// Generated from C:/Users/Khaled/Desktop/CompilersSemesterProject/COOL PROJECT/grammar\Parse.g4 by ANTLR 4.7.2

	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parse}.
 */
public interface ParseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parse#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parse.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parse.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link Parse#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterClasses(Parse.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link Parse#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitClasses(Parse.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(Parse.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(Parse.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#featureList}.
	 * @param ctx the parse tree
	 */
	void enterFeatureList(Parse.FeatureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#featureList}.
	 * @param ctx the parse tree
	 */
	void exitFeatureList(Parse.FeatureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(Parse.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(Parse.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(Parse.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(Parse.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(Parse.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(Parse.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(Parse.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(Parse.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parse#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(Parse.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parse#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(Parse.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(Parse.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(Parse.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterLetIn(Parse.LetInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitLetIn(Parse.LetInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(Parse.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(Parse.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(Parse.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(Parse.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(Parse.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(Parse.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueOrFlase}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueOrFlase(Parse.TrueOrFlaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueOrFlase}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueOrFlase(Parse.TrueOrFlaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(Parse.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(Parse.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(Parse.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(Parse.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Parse.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Parse.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Parse.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Parse.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(Parse.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(Parse.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(Parse.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(Parse.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(Parse.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(Parse.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(Parse.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(Parse.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(Parse.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(Parse.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(Parse.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(Parse.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parse.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parse.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(Parse.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(Parse.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(Parse.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(Parse.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(Parse.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(Parse.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterIf(Parse.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitIf(Parse.IfContext ctx);
}
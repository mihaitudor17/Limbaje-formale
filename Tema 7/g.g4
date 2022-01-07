grammar g;
fragment Digit:[0-9];
Number:Digit+;
fragment Letter:[a-zA-Z];
fragment IF:'if';
fragment ELSE:'else';
fragment FOR:'for';
fragment WHILE:'while';
KeyWord:(FOR|WHILE|IF|ELSE);
Identifier:(Letter)(Letter|Digit|'_')*;
ArithmeticOperator:('+'|'-'|'*'|'/');
RelationalOperator:('<'|'>'|'<='|'>='|'=='|'!=');
fragment P1:'(';
fragment P2:'(';
fragment P3:'[';
fragment P4:'}';
Paranthesys:(P1|P2|P3|P4);
AssignmentOperator:'=';
Semicolon:';';
WS
    : [ \t\r\n]+ -> channel(HIDDEN)
;
COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;
loopstatement:(('for' '('(declaration|Identifier)?(Identifier RelationalOperator Identifier)?(Identifier RelationalOperator (Identifier|Number))?';'(Identifier AssignmentOperator Identifier ArithmeticOperator (Identifier|Number))?')'(('{'content*'}')|Semicolon))|('while''('(Identifier|compare|(Identifier ArithmeticOperator Identifier))')'(';'|('{'content*'}'))));
selectionstatement:'if''('(Identifier|compare|(Identifier ArithmeticOperator Identifier))')'(Semicolon|('{'content*('}'|('}' 'else' '{'content*'}'))));
declaration:(Identifier Identifier)|(Identifier Identifier AssignmentOperator (Identifier|Number) )|(Identifier Identifier AssignmentOperator '"' Identifier '"') Semicolon;
compare:Identifier RelationalOperator (Identifier|(Identifier ArithmeticOperator Identifier)|Number);
operation:(Identifier AssignmentOperator (Identifier|Number)(ArithmeticOperator (Identifier|Number))? Semicolon);
content:(loopstatement|selectionstatement|operation|declaration);
main:(loopstatement|selectionstatement|operation|declaration)+;
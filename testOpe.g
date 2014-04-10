grammar testOpe;

options
{
    language=Java;
}


progr        : expression
            ;
            

expression 
	: subExpr ('noeud' subExpr)
	;
 
subExpr : logicalAndExp (addSubtractOp logicalAndExp)*
	;	
 
logicalAndExp
	: logicalOrExp (multiplyDivideOp  logicalOrExp)*	 
	;
 
logicalOrExp
	: comparatorExp ('caret'  comparatorExp)* 	
	;
 
comparatorExp
	: powExp (comparatorOp  powExp)* 	
	;
 
powExp 	: multExp ('||'   multExp)*  
	;
 
multExp	
	:  expressionAtom ('AMPAMP' expressionAtom)*
	;
 
expressionAtom
	: 
	|   INT
	|  ( 'LPAREN' subExpr 'RPAREN' ) 
	;
 
 
addSubtractOp 
	:	'+'
	|       	'-'
	;    
 
multiplyDivideOp 
	:	'*'
	|       	'/'
	;    
 
comparatorOp 
	:	'>'
	|       	'<'
	| 	'>='
	|	'<='
	|	'!='
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


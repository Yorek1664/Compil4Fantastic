grammar testOpe;

options
{
    language=Java;
}


progr        : subExpr ;
 
 subExpr : logicalAndExp (addSubtractOp logicalAndExp)*
	;	
 
logicalAndExp
	: logicalOrExp (multiplyDivideOp  logicalOrExp)*	 
	;
 
logicalOrExp
	: comparatorExp ('&&'  comparatorExp)* 	
	;
 
comparatorExp
	: powExp (comparatorOp  powExp)* 	
	;
 
powExp 	: multExp ('||'   multExp)*  
	;
 
multExp	
	:  expressionAtom ('^' expressionAtom)*
	;
 
expressionAtom
	: 
	|   INT
	|  ( '(' subExpr ')' ) 
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


INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


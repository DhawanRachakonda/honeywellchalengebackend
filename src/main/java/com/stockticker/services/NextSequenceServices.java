package com.stockticker.services;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.stockticker.documents.CustomSequences;

@Service
public class NextSequenceServices {

	@Autowired
	private MongoOperations mongoOperations;

	public int getNextSequence(String seqName) {
        CustomSequences counter = mongoOperations.findAndModify(query(where("_id").is(seqName)), new Update().inc("seq", 1),
                options().returnNew(true).upsert(true), CustomSequences.class);
        return counter.getSeq();
    }
}

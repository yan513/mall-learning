package com.yl.mall.po;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabasechangelogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatabasechangelogExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andDateexecutedIsNull() {
            addCriterion("DATEEXECUTED is null");
            return (Criteria) this;
        }

        public Criteria andDateexecutedIsNotNull() {
            addCriterion("DATEEXECUTED is not null");
            return (Criteria) this;
        }

        public Criteria andDateexecutedEqualTo(Date value) {
            addCriterion("DATEEXECUTED =", value, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedNotEqualTo(Date value) {
            addCriterion("DATEEXECUTED <>", value, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedGreaterThan(Date value) {
            addCriterion("DATEEXECUTED >", value, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATEEXECUTED >=", value, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedLessThan(Date value) {
            addCriterion("DATEEXECUTED <", value, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedLessThanOrEqualTo(Date value) {
            addCriterion("DATEEXECUTED <=", value, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedIn(List<Date> values) {
            addCriterion("DATEEXECUTED in", values, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedNotIn(List<Date> values) {
            addCriterion("DATEEXECUTED not in", values, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedBetween(Date value1, Date value2) {
            addCriterion("DATEEXECUTED between", value1, value2, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andDateexecutedNotBetween(Date value1, Date value2) {
            addCriterion("DATEEXECUTED not between", value1, value2, "dateexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedIsNull() {
            addCriterion("ORDEREXECUTED is null");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedIsNotNull() {
            addCriterion("ORDEREXECUTED is not null");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedEqualTo(Integer value) {
            addCriterion("ORDEREXECUTED =", value, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedNotEqualTo(Integer value) {
            addCriterion("ORDEREXECUTED <>", value, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedGreaterThan(Integer value) {
            addCriterion("ORDEREXECUTED >", value, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDEREXECUTED >=", value, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedLessThan(Integer value) {
            addCriterion("ORDEREXECUTED <", value, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedLessThanOrEqualTo(Integer value) {
            addCriterion("ORDEREXECUTED <=", value, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedIn(List<Integer> values) {
            addCriterion("ORDEREXECUTED in", values, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedNotIn(List<Integer> values) {
            addCriterion("ORDEREXECUTED not in", values, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedBetween(Integer value1, Integer value2) {
            addCriterion("ORDEREXECUTED between", value1, value2, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andOrderexecutedNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDEREXECUTED not between", value1, value2, "orderexecuted");
            return (Criteria) this;
        }

        public Criteria andExectypeIsNull() {
            addCriterion("EXECTYPE is null");
            return (Criteria) this;
        }

        public Criteria andExectypeIsNotNull() {
            addCriterion("EXECTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExectypeEqualTo(String value) {
            addCriterion("EXECTYPE =", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeNotEqualTo(String value) {
            addCriterion("EXECTYPE <>", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeGreaterThan(String value) {
            addCriterion("EXECTYPE >", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXECTYPE >=", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeLessThan(String value) {
            addCriterion("EXECTYPE <", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeLessThanOrEqualTo(String value) {
            addCriterion("EXECTYPE <=", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeLike(String value) {
            addCriterion("EXECTYPE like", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeNotLike(String value) {
            addCriterion("EXECTYPE not like", value, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeIn(List<String> values) {
            addCriterion("EXECTYPE in", values, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeNotIn(List<String> values) {
            addCriterion("EXECTYPE not in", values, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeBetween(String value1, String value2) {
            addCriterion("EXECTYPE between", value1, value2, "exectype");
            return (Criteria) this;
        }

        public Criteria andExectypeNotBetween(String value1, String value2) {
            addCriterion("EXECTYPE not between", value1, value2, "exectype");
            return (Criteria) this;
        }

        public Criteria andMd5sumIsNull() {
            addCriterion("MD5SUM is null");
            return (Criteria) this;
        }

        public Criteria andMd5sumIsNotNull() {
            addCriterion("MD5SUM is not null");
            return (Criteria) this;
        }

        public Criteria andMd5sumEqualTo(String value) {
            addCriterion("MD5SUM =", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotEqualTo(String value) {
            addCriterion("MD5SUM <>", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumGreaterThan(String value) {
            addCriterion("MD5SUM >", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumGreaterThanOrEqualTo(String value) {
            addCriterion("MD5SUM >=", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumLessThan(String value) {
            addCriterion("MD5SUM <", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumLessThanOrEqualTo(String value) {
            addCriterion("MD5SUM <=", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumLike(String value) {
            addCriterion("MD5SUM like", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotLike(String value) {
            addCriterion("MD5SUM not like", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumIn(List<String> values) {
            addCriterion("MD5SUM in", values, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotIn(List<String> values) {
            addCriterion("MD5SUM not in", values, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumBetween(String value1, String value2) {
            addCriterion("MD5SUM between", value1, value2, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotBetween(String value1, String value2) {
            addCriterion("MD5SUM not between", value1, value2, "md5sum");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("TAG is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("TAG is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("TAG =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("TAG <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("TAG >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("TAG >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("TAG <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("TAG <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("TAG like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("TAG not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("TAG in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("TAG not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("TAG between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("TAG not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andLiquibaseIsNull() {
            addCriterion("LIQUIBASE is null");
            return (Criteria) this;
        }

        public Criteria andLiquibaseIsNotNull() {
            addCriterion("LIQUIBASE is not null");
            return (Criteria) this;
        }

        public Criteria andLiquibaseEqualTo(String value) {
            addCriterion("LIQUIBASE =", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseNotEqualTo(String value) {
            addCriterion("LIQUIBASE <>", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseGreaterThan(String value) {
            addCriterion("LIQUIBASE >", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseGreaterThanOrEqualTo(String value) {
            addCriterion("LIQUIBASE >=", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseLessThan(String value) {
            addCriterion("LIQUIBASE <", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseLessThanOrEqualTo(String value) {
            addCriterion("LIQUIBASE <=", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseLike(String value) {
            addCriterion("LIQUIBASE like", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseNotLike(String value) {
            addCriterion("LIQUIBASE not like", value, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseIn(List<String> values) {
            addCriterion("LIQUIBASE in", values, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseNotIn(List<String> values) {
            addCriterion("LIQUIBASE not in", values, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseBetween(String value1, String value2) {
            addCriterion("LIQUIBASE between", value1, value2, "liquibase");
            return (Criteria) this;
        }

        public Criteria andLiquibaseNotBetween(String value1, String value2) {
            addCriterion("LIQUIBASE not between", value1, value2, "liquibase");
            return (Criteria) this;
        }

        public Criteria andContextsIsNull() {
            addCriterion("CONTEXTS is null");
            return (Criteria) this;
        }

        public Criteria andContextsIsNotNull() {
            addCriterion("CONTEXTS is not null");
            return (Criteria) this;
        }

        public Criteria andContextsEqualTo(String value) {
            addCriterion("CONTEXTS =", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsNotEqualTo(String value) {
            addCriterion("CONTEXTS <>", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsGreaterThan(String value) {
            addCriterion("CONTEXTS >", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTEXTS >=", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsLessThan(String value) {
            addCriterion("CONTEXTS <", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsLessThanOrEqualTo(String value) {
            addCriterion("CONTEXTS <=", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsLike(String value) {
            addCriterion("CONTEXTS like", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsNotLike(String value) {
            addCriterion("CONTEXTS not like", value, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsIn(List<String> values) {
            addCriterion("CONTEXTS in", values, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsNotIn(List<String> values) {
            addCriterion("CONTEXTS not in", values, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsBetween(String value1, String value2) {
            addCriterion("CONTEXTS between", value1, value2, "contexts");
            return (Criteria) this;
        }

        public Criteria andContextsNotBetween(String value1, String value2) {
            addCriterion("CONTEXTS not between", value1, value2, "contexts");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNull() {
            addCriterion("LABELS is null");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNotNull() {
            addCriterion("LABELS is not null");
            return (Criteria) this;
        }

        public Criteria andLabelsEqualTo(String value) {
            addCriterion("LABELS =", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotEqualTo(String value) {
            addCriterion("LABELS <>", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThan(String value) {
            addCriterion("LABELS >", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThanOrEqualTo(String value) {
            addCriterion("LABELS >=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThan(String value) {
            addCriterion("LABELS <", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThanOrEqualTo(String value) {
            addCriterion("LABELS <=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLike(String value) {
            addCriterion("LABELS like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotLike(String value) {
            addCriterion("LABELS not like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsIn(List<String> values) {
            addCriterion("LABELS in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotIn(List<String> values) {
            addCriterion("LABELS not in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsBetween(String value1, String value2) {
            addCriterion("LABELS between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotBetween(String value1, String value2) {
            addCriterion("LABELS not between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIsNull() {
            addCriterion("DEPLOYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIsNotNull() {
            addCriterion("DEPLOYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdEqualTo(String value) {
            addCriterion("DEPLOYMENT_ID =", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotEqualTo(String value) {
            addCriterion("DEPLOYMENT_ID <>", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdGreaterThan(String value) {
            addCriterion("DEPLOYMENT_ID >", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPLOYMENT_ID >=", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLessThan(String value) {
            addCriterion("DEPLOYMENT_ID <", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLessThanOrEqualTo(String value) {
            addCriterion("DEPLOYMENT_ID <=", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLike(String value) {
            addCriterion("DEPLOYMENT_ID like", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotLike(String value) {
            addCriterion("DEPLOYMENT_ID not like", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIn(List<String> values) {
            addCriterion("DEPLOYMENT_ID in", values, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotIn(List<String> values) {
            addCriterion("DEPLOYMENT_ID not in", values, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdBetween(String value1, String value2) {
            addCriterion("DEPLOYMENT_ID between", value1, value2, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotBetween(String value1, String value2) {
            addCriterion("DEPLOYMENT_ID not between", value1, value2, "deploymentId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
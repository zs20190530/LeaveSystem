<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="apply-leave-box">
<div class="error-message">${message}</div>
<form action="applyLeave" method="post">
    <div>
        <label>提出日</label>
        <div>${now}<input type="hidden" value="${now}" name="apply_date"/></div>
    </div>
    <div>
        <label>休假种别</label>
        <div>
            <select name="leave_type">
                <option value="年休">年休</option>
                <option value="事假">事假</option>
            </select>
        </div>
    </div>
    <div>
        <label>开始日</label>
        <div><input type="text" name="begin_time"/></div>
    </div>
    <div>
        <label>结束日</label>
        <div><input type="text" name="end_time"/></div>
    </div>
    <div>
        <label>日数</label>
        <div><input type="number" name="days"/></div>
    </div>
    <div>
        <label>理由</label>
        <div>
            <textarea rows="3" cols="20" name="reason"></textarea>
        </div>
    </div>
    <button type="submit">提交</button>
</form>
</div>
impl Solution {
    pub fn largest_rectangle_area(mut heights: Vec<i32>) -> i32 {
        heights.push(0); 
        let mut stack: Vec<usize> = Vec::new();
        let mut max_area = 0;
        for i in 0..heights.len() {
            let current_height = heights[i];
            while let Some(&last_idx) = stack.last() {
                if heights[last_idx] >= current_height {
                    let h = heights[stack.pop().unwrap()]; 
                    
                    let width = if stack.is_empty() {
                        i as i32 
                    } else {
                        (i - stack.last().unwrap() - 1) as i32
                    };

                    max_area = max_area.max(h * width);
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        max_area
    }
}
